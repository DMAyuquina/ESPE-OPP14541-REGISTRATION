package ec.edu.espe.registersystemmaven.controller;

import ec.edu.espe.registersystemmaven.model.Grade;
import org.bson.Document;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
public class GradeManager {
    public static Document gradeToDocument(Grade grade){
       Document gradeDoc = new Document();
       gradeDoc.append("unitOne", grade.getUnitOne())
               .append("unitTwo", grade.getUnitTwo())
               .append("finalGrade", grade.getFinalGrade())
               .append("lastChance", grade.getLastChance());
       
       return gradeDoc;
    }
}
