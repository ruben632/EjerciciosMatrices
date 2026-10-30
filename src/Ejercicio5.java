void main() {
    Scanner ruben = new Scanner(System.in);

    float[][] notas = new float[20][6];

    for (int i = 0; i < notas.length; i++) {
        System.out.println("Alumno " + (i + 1) + ":");

        for (int j = 0; j < 3; j++) {
            System.out.println("Nota " + (j + 1) + ":");
            notas[i][j] = ruben.nextFloat();
        }
    }

    for (int i = 0; i < notas.length; i++) {
        float suma = 0;

        notas[i][4] = notas[i][0];
        notas[i][5] = notas[i][0];

        for (int j = 0; j < 3; j++) {
            suma = suma + notas[i][j];

            if (notas[i][j] > notas[i][4]) {
                notas[i][4] = notas[i][j];
            }

            if (notas[i][j] < notas[i][5]) {
                notas[i][5] = notas[i][j];
            }
        }

        notas[i][3] = suma / 3;
    }

    System.out.println("Nota1\tNota2\tNota3\tPromedio\tMaxima\tMinima");

    for (int i = 0; i < notas.length; i++) {
        for (int j = 0; j < notas[i].length; j++) {
            System.out.print(notas[i][j] + "\t");
        }
        System.out.println();
    }

    float mejorNota = notas[0][0];
    float peorNota = notas[0][0];

    for (int i = 0; i < notas.length; i++) {
        for (int j = 0; j < 3; j++) {
            if (notas[i][j] > mejorNota) {
                mejorNota = notas[i][j];
            }

            if (notas[i][j] < peorNota) {
                peorNota = notas[i][j];
            }
        }
    }

    System.out.println("Mejor nota del curso: " + mejorNota);
    System.out.println("Peor nota del curso: " + peorNota);

    ruben.close();
}