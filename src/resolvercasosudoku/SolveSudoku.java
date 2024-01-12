
package resolvercasosudoku;

public class SolveSudoku {
    
    private final int LIBRE = 0; //Representa los campos vacios/libres por resolver
    private int[][] sudoku;
    
    public SolveSudoku(int[][] sudoku){
        this.sudoku = sudoku;
    }
    
    public boolean Resolver(){
        //Se recorre la matriz sudoku
        for(int i = 0; i<this.sudoku.length; i++){
            for(int j = 0; j<this.sudoku[0].length; j++){
                //Al encontrar un espacio libre probara las opciones disponibles
                if(sudoku[i][j] == LIBRE){
                    for(int prueba = 1; prueba <= 9; prueba++){
                        if(isPosible(i,j,prueba)){
                            //Si resulta aceptable la respuesta cambiara el valor
                            sudoku[i][j] = prueba;
                            
                            //Llamara al metodo recursivamente para continuar resolviendo 
                            //los demas campos vacios
                            
                            if(Resolver()) 
                                //Como es una llamada recursiva, si se llego hasta el ultimo campo sin error,
                                //entonces el sudoku estara resuelto
                                return true;
                            //En caso se llegue a un error se retornara para probar otras opciones
                            else sudoku[i][j] = LIBRE; 
                        }
                    }
                    
                    //Determina que se llego a un error cuando se probaron todos los numeros
                    //y no hay opciones disponibles para llenar el campo
                    return false;
                }
            }
        }
        
        return true;
    }
    
    //Es posible ingresar un numero cuando es posible insertarlo en un grupo (fila, columna o cuadro)
    private boolean isPosible(int fila, int columna, int numposible){
        return !(isEnFila(fila,numposible) || isEnColumna(columna, numposible) || isEnCuadro(fila, columna, numposible));
    }
    
    //Determina si es posible insertar el numero en una fila
    private boolean isEnFila(int fila, int posible){
        
        //Es posible ingresar el numero cuando la fila no tiene otro numero igual
        for(int i = 0; i<this.sudoku.length;i++){
            if(this.sudoku[fila][i] == posible){
                return true;
            }
        }
        
        return false;
    }
    
    //Determina si es posible insertar el numero en una columna
    private boolean isEnColumna(int columna, int posible){
        
        //Es posible ingresar el numero cuando la columna no tiene otro numero igual
        for(int i = 0; i<this.sudoku.length; i++){
            if(this.sudoku[i][columna] == posible)  return true;
        }
        
        return false;
    }
    
    //Determina si es posible insertar el numero en un cuadro
    private boolean isEnCuadro(int fila, int columna, int posible){
        
        //Determina cual de los 9 cuadros es donde se ubica el numero
        int filaInicio = fila - fila%3;
        int columnaInicio = columna - columna%3;
        
        //Es posible insertar el numero cuando el cuadro no tiene otro numero igual
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
