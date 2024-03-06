module com.example.sem2 {
    requires java.control;
    requires java.xml;


    opens com.example.sem2 to java.xml;
    exports com.example.sem2;
}