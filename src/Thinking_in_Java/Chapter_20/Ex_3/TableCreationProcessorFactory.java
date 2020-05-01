package Thinking_in_Java.Chapter_20.Ex_3;

import Thinking_in_Java.Chapter_20.Ex_1.*;
import com.sun.mirror.apt.*;
import com.sun.mirror.declaration.*;
import com.sun.mirror.util.*;

import java.util.*;

import static com.sun.mirror.apt.AnnotationProcessors.NO_OP;
import static com.sun.mirror.util.DeclarationVisitors.getDeclarationScanner;

public class TableCreationProcessorFactory
        implements AnnotationProcessorFactory {
    public AnnotationProcessor getProcessorFor(
            Set<AnnotationTypeDeclaration> atds,
            AnnotationProcessorEnvironment env) {
        return new TableCreationProcessor(env);
    }
    public Collection<String> supportedAnnotationTypes() {
        return Arrays.asList(
                "Thinking_in_Java.Chapter_20.Ex_1.DBTable",
                "Thinking_in_Java.Chapter_20.Ex_1.Constraints",
                "Thinking_in_Java.Chapter_20.Ex_1.SQLString",
                "Thinking_in_Java.Chapter_20.Ex_1.SQLInteger",
                "Thinking_in_Java.Chapter_20.Ex_1.SQLChar");
    }
    public Collection<String> supportedOptions() {
        return Collections.emptySet();
    }
    private static class TableCreationProcessor
            implements AnnotationProcessor {
        private final AnnotationProcessorEnvironment env;
        private String sql = "";
        public TableCreationProcessor(
                AnnotationProcessorEnvironment env) {
            this.env = env;
        }
        public void process() {
            for(TypeDeclaration typeDecl :
                    env.getSpecifiedTypeDeclarations()) {
                typeDecl.accept(getDeclarationScanner(
                        new TableCreationVisitor(), (DeclarationVisitor) NO_OP));
                sql = sql.substring(0, sql.length() - 1) + ");";
                System.out.println("creation SQL is :\n" + sql);
                sql = "";
            }
        }
        private class TableCreationVisitor
                extends SimpleDeclarationVisitor {
            public void visitClassDeclaration(
                    ClassDeclaration d) {
                DBTable dbTable = d.getAnnotation(DBTable.class);
                if(dbTable != null) {
                    sql += "CREATE TABLE ";
                    sql += (dbTable.name().length() < 1)
                            ? d.getSimpleName().toUpperCase()
                            : dbTable.name();
                    sql += " (";
                }
            }
            public void visitFieldDeclaration(
                    FieldDeclaration d) {
                String columnName = "";
                if(d.getAnnotation(SQLInteger.class) != null) {
                    SQLInteger sInt = d.getAnnotation(
                            SQLInteger.class);
// Use field name if name not specified
                    if(sInt.name().length() < 1)
                        columnName = d.getSimpleName().toUpperCase();
                    else
                        columnName = sInt.name();
                    sql += "\n " + columnName + " INT" +
                            getConstraints(sInt.constraints()) + ",";
                }
                if(d.getAnnotation(SQLString.class) != null) {
                    SQLString sString = d.getAnnotation(
                            SQLString.class);
// Use field name if name not specified.
                    if(sString.name().length() < 1)
                        columnName = d.getSimpleName().toUpperCase();
                    else
                        columnName = sString.name();
                    sql += "\n " + columnName + " VARCHAR(" +
                            sString.value() + ")" +
                            getConstraints(sString.constraints()) + ",";
                }
                if(d.getAnnotation(SQLChar.class) != null) {
                    SQLChar sChar = d.getAnnotation(
                            SQLChar.class);
// Use field name if name not specified.
                    if(sChar.name().length() < 1)
                        columnName = d.getSimpleName().toUpperCase();
                    else
                        columnName = sChar.name();
                    sql += "\n " + columnName + " VARCHAR(" +
                            sChar.value() + sChar.letter() + ")" +
                            getConstraints(sChar.constraints()) + ",";
                }



            }
            private String getConstraints(Constraints con) {
                String constraints = "";
                if(!con.allowNull())
                    constraints += " NOT NULL";
                if(con.primaryKey())
                    constraints += " PRIMARY KEY";
                if(con.unique())
                    constraints += " UNIQUE";
                return constraints;
            }
        }
    }
}