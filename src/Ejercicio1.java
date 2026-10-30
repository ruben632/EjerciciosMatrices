void main() {
        Scanner ruben = new Scanner(System.in);

        System.out.println("Numero de filas:");
        int n = ruben.nextInt();

        System.out.println("Numero de columnas:");
        int m = ruben.nextInt();

        int[][] matriz = new int[n][m];
        int[] sumas = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Valor de [" + i + "][" + j + "]:");
                matriz[i][j] = ruben.nextInt();
            }
        }

        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                sumas[j] = sumas[j] + matriz[i][j];
            }
        }

        System.out.println("Suma de cada columna:");

        for (int j = 0; j < m; j++) {
            System.out.print(sumas[j] + " ");
        }

        System.out.println();
        ruben.close();
    }