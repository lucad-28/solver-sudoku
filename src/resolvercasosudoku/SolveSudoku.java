
package resolvercasosudoku;

public class SolveSudoku {
    
    private final int LIBRE = 0;
    private int[][] sudoku;
    
    public SolveSudoku(int[][] sudoku){
        this.sudoku = sudoku;
    }
    
    public boolean Resolver(){
        for(int i = 0; i<this.sudoku.length; i++){
            for(int j = 0; j<this.sudoku[0].length; j++){
                if(sudoku[i][j] == LIBRE){
                    for(int prueba = 1; prueba <= 9; prueba++){
                        if(isPosible(i,j,prueba)){
                            sudoku[i][j] = prueba;
                            if(Resolver()) return true;
                            else sudoku[i][j] = LIBRE;
                        }
                    }
                    return false;
                }
            }
        }
        
        return true;
    }
    
    private boolean isPosible(int fila, int columna, int numposible){
        return !(isEnFila(fila,numposible) || isEnColumna(columna, numposible) || isEnCuadro(fila, columna, numposible));
    }
    
    private boolean isEnFila(int fila, int posible){
        for(int i = 0; i<this.sudoku.length;i++){
            if(this.sudoku[fila][i] == posible){
                return true;
            }
        }
        
        return false;
    }
    
    private boolean isEnColumna(int columna, int posible){
        for(int i = 0; i<this.sudoku.length; i++){
            if(this.sudoku[i][columna] == posible)  return true;
        }
        
        return false;
    }
    
    private boolean isEnCuadro(int fila, int columna, int posible){
        int filaInicio = fila - fila%3;
        int columnaInicio = columna - columna%3;
        
        for(int i = filaInicio; i < filaInicio + 3; i++){
            for(int j = columnaInicio; j < columnaInicio + 3; j++){
                if(sudoku[i][j] == posible) return true;
            }
        }
        
        return false;
    }
    
    public void ImprimirSudoku(){
        for(int i = 0; i<9; i++){
            for(int j = 0; j<9; j++){
                if(sudoku[i][j] != 0) System.out.print(sudoku[i][j]+" ");
                else System.out.print("_ ");
                if(j%3 == 2) System.out.print("  ");
            }
            System.out.println();
            if(i%3 == 2) System.out.println();
        }
    }

    public int[][] getSudoku() {
        return sudoku;
    }
    
    
}
