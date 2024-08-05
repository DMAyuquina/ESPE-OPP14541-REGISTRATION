package ec.edu.espe.registersystemmaven.controller;

import ec.edu.espe.registersystemmaven.model.Registration;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author LogicLegion, DCCO-ESPE
 */
public class RegistrationManager {

    public static Document registrationToDocument(Registration registration) {
        Document registrationDoc = new Document();
        registrationDoc.append("period", registration.getPeriod())
                .append("typeOfRegistration", registration.getTypeOfRegistration())
                .append("gratuity", registration.getGratuity());

        return registrationDoc;
    }

    public static String determinateGratuity(String typeOfRegistration) {

        String typeInUpperCase = typeOfRegistration.toUpperCase();

        if (typeInUpperCase.equals("PRIMERA")) {
            return "CON GRATUIDAD";
        } else if (typeInUpperCase.equals("SEGUNDA") || typeInUpperCase.equals("TERCERA")) {
            return "SIN GRATUIDAD";
        } else {
            JOptionPane.showMessageDialog(null, "Tipo de matrícula no válido", "Error", JOptionPane.ERROR_MESSAGE);
            return "TIPO NO VALIDO";
        }
    }

    public boolean determinatePromoteByAssistence(float assistence) {

        if (assistence <= 0.8) {
            return false;
        }

        return true;
    }

    public boolean determinatePromoteByFinalGrade(float finalGrade) {

        if (finalGrade < 7) {
            return true;
        }

        return false;
    }

}
