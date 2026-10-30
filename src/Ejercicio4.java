void main() {
    char[][] matriz = new char[5][5];

    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            if (i == j || i + j == 4) {
                matriz[i][j] = 'X';
            } else {
                matriz[i][j] = ' ';
            }

            System.out.print(matriz[i][j] + " ");
        }
        System.out.println();
    }
}