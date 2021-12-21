module kelompokHIJ {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires sqlite.jdbc;

    opens id.ac.ukdw.fti.rpl.kelompokHIJ to javafx.fxml;
    exports id.ac.ukdw.fti.rpl.kelompokHIJ.database;
    exports id.ac.ukdw.fti.rpl.kelompokHIJ.modal;
    exports id.ac.ukdw.fti.rpl.kelompokHIJ;
 


}