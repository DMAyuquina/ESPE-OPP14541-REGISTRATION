package ec.edu.espe.registrationsystem.view;

import java.awt.Menu;

/**
 *
 * @author Marcelo Acuña, Logic Legion, DCCO-ESPE
 */
public class RegistrationSystem {

    public static void main(String[] args) {
        System.out.println("--------Sistema de Matriculas de Estidiantes Intituto Tecnologico Superior Bolivar V0.13-------");

        ManagerMenu objetoMenu = new ManagerMenu();
        objetoMenu.callMainMenu();
    }
}
