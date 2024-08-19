package ec.edu.espe.registersystemmaven.controller;

import ec.edu.espe.registersystemmaven.model.Grade;
import org.bson.Document;

/**
 *
 * @author LogicLegion, DCCO-ESPE
 */
public class GradeManager {
    public static Document gradeToMongoDocument(Grade grade){
       Document gradeDoc = new Document();
       gradeDoc.append("unitOne", grade.getUnitOne())
               .append("unitTwo", grade.getUnitTwo())
               .append("finalGrade", grade.getFinalGrade())
               .append("lastChance", grade.getLastChance());
       
       return gradeDoc;
    }
}
