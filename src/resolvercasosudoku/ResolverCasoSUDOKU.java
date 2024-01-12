
package resolvercasosudoku;

import GUI.InterGrafica;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

public class ResolverCasoSUDOKU {

    public static void main(String[] args) {
        
        //Se establece una matriz vacia
        int[][] sudoku = {{0,0,0,0,0,0,0,0,0},
                          {0,0,0,0,0,0,0,0,0},
                          {0,0,0,0,0,0,0,0,0},
                          {0,0,0,0,0,0,0,0,0},
                          {0,0,0,0,0,0,0,0,0},
                          {0,0,0,0,0,0,0,0,0},
                          {0,0,0,0,0,0,0,0,0},
                          {0,0,0,0,0,0,0,0,0},
                          {0,0,0,0,0,0,0,0,0}
        };
        
        //Se inicializa la logica de la resolucion
        SolveSudoku Resolucion = new SolveSudoku(sudoku);
        
        //Se inicializan los componentes graficos
        InterGrafica tab = new InterGrafica();
        tab.setVisible(true);
        tab.agregarCamposAlTablero();
        
        
        class SolicitarSolucion extends MouseAdapter{
            
            SolveSudoku Resolucion;
            
            SolicitarSolucion(SolveSudoku Resolucion){
                this.Resolucion = Resolucion;
            }
            
            @Override
            public void mouseClicked(MouseEvent e) {
                boolean ValoresCorrectos = true;
                
                //Se toma cada cuadro del tablero y verifica si cumple con las reglas de SUDOKU
                for(JTextField campo: tab.getTablero()){
                    
                    //Se intenta obtener los valores de cada cuadro
                    try {
                        //Se establece el estado vacio de un cuadro representado con 0
                        //Se verifica si se insertaron numero enteros
                        int number = 0;
                        if(!campo.getText().equals("")){
                            number = Integer.parseInt(campo.getText());
                        }
                        
                        //Se verifican si los numeros son aceptables y establece el formato correspondiente
                        if (number > 9 || number < 0) {
                            
                            campo.setForeground(Color.RED);
                            campo.setBorder(BorderFactory.createMatteBorder(((MatteBorder)campo.getBorder()).getBorderInsets().top,
                                                                            ((MatteBorder)campo.getBorder()).getBorderInsets().left,
                                                                            ((MatteBorder)campo.getBorder()).getBorderInsets().bottom,
                                                                            ((MatteBorder)campo.getBorder()).getBorderInsets().right, 
                                                                            Color.RED));
                            ValoresCorrectos = false;
                        }else{
                            
                            campo.setForeground(Color.BLACK);
                            campo.setBorder(BorderFactory.createMatteBorder(((MatteBorder)campo.getBorder()).getBorderInsets().top,
                                                                            ((MatteBorder)campo.getBorder()).getBorderInsets().left,
                                                                            ((MatteBorder)campo.getBorder()).getBorderInsets().bottom,
                                                                            ((MatteBorder)campo.getBorder()).getBorderInsets().right, 
                                                                            new java.awt.Color(0, 142, 199)));
                        }
                    } catch (NumberFormatException ex) {
                        // Manejar la excepción si el texto no es un número válido
                        campo.setForeground(Color.RED);
                        campo.setBorder(BorderFactory.createMatteBorder(((MatteBorder)campo.getBorder()).getBorderInsets().top,
                                                                            ((MatteBorder)campo.getBorder()).getBorderInsets().left,
                                                                            ((MatteBorder)campo.getBorder()).getBorderInsets().bottom,
                                                                            ((MatteBorder)campo.getBorder()).getBorderInsets().right, 
                                                                            Color.RED));
                        ValoresCorrectos = false;
                    }
                    
                }
                
                
                if(ValoresCorrectos == false) {
                    //Cuando los valores no son correctos muestra un mensaje de error
                    tab.getAdv1().setVisible(true);
                    tab.getAdv2().setVisible(true);
                    tab.getAdv3().setVisible(true);
                }else{
                    
                    //Cuando son correctos
                    //toma los valores introducios y los copia a la matriz sudoku tomando en cuenta los campos vacios (0)
                    for(int i = 0; i<81; i++){
                        if(tab.getTablero().get(i).getText().equals("")) sudoku[i/9][i%9] =  0;
                        else sudoku[i/9][i%9] = Integer.parseInt(tab.getTablero().get(i).getText());
                        tab.getTablero().get(i).setEditable(false);
                        tab.getTablero().get(i).setBackground(Color.WHITE);
                    }
                    
                    //Se despliega la matriz ingresada por consola
                    System.out.println("Se inserto el sudoku a resolver: ");
                    Resolucion = new SolveSudoku(sudoku);
                    Resolucion.ImprimirSudoku();
                    
                    //Se toma una matriz sudoku temporal
                    int [][] sudokutemp = new int[9][9];
                    for(int i=0; i<9; i++){
                        System.arraycopy(sudoku[i], 0, sudokutemp[i], 0, 9);
                    }
                    
                    //Se resuelve el sudoku
                    Resolucion.Resolver();
                                        
                    //Se despliega el sudoku en consola
                    System.out.println("\n-----------------------------------------------------\n");
                    System.out.println("Resolucion del sudoku");
                    Resolucion.ImprimirSudoku();
                    
                    //Se despliega el sudoku resuelto en la interfaz
                    //Se toma en cuenta la matriz sudoku temporal anterior con la resolucion para denotar la solucion
                    for(int i = 0; i<81; i++){
                        if(sudokutemp[i/9][i%9] !=  Resolucion.getSudoku()[i/9][i%9]) {
                            tab.getTablero().get(i).setForeground(new Color(65,160,0));
                            tab.getTablero().get(i).setText(String.valueOf(Resolucion.getSudoku()[i/9][i%9]));
                        }
                    }
                    
                    tab.getBtnSolucionar1().setVisible(false);
                    tab.getBtnProblema().setVisible(false);
                }
            }
        }
        tab.getBtnSolucionar1().addMouseListener(new SolicitarSolucion(Resolucion));
        
        //Se despliega el problema dado en clase
        class ProblemaDefault extends MouseAdapter{
            @Override
            public void mouseClicked(MouseEvent e){
                int[][] Problema = {{8,0,0,0,0,9,0,0,0},
                                    {9,6,2,0,7,0,3,0,0},
                                    {0,3,7,2,5,6,0,0,0},
                                    {0,0,0,0,3,2,0,7,9},
                                    {0,0,1,7,0,0,0,0,0},
                                    {0,0,0,5,0,0,0,6,0},
                                    {0,8,0,4,2,0,9,0,0},
                                    {0,0,0,0,0,0,0,0,7},
                                    {0,0,9,6,0,0,0,5,0}};
                
                for(int i = 0; i<81; i++){
                    if(Problema[i/9][i%9] != 0) tab.getTablero().get(i).setText(String.valueOf(Problema[i/9][i%9]));
                    else tab.getTablero().get(i).setText("");
                }
            }
            
        }
        tab.getBtnProblema().addMouseListener(new ProblemaDefault());
        
    }    
}
