package mainapp;

import java.util.List;
import java.util.Map;

public class MainApp {
    public static void main(String[] args) {
        CreateTable createTable = new CreateTable();
        InsertRow insertRow = new InsertRow();
        SelectRow selectRow = new SelectRow();
        UpdateRow updateRow = new UpdateRow();
        DeleteRow deleteRow = new DeleteRow();

/*        insertRow.insertRow("quang","ha nam");*/

        selectRow.select();

/*        updateRow.updateAddress("ha nam","Ha Nam");*/

    /*    deleteRow.delete("Ha Nam");*/
    }
}
