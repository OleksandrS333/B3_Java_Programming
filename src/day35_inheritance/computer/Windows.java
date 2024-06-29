package day35_inheritance.computer;

public class Windows extends Computer{

    String edgeVersion;



    public Windows(String os, int memory) {
        //super();
        super(os, memory);
        //this.os = os;
        //this.memory = memory;
    }


    // new Windows ("Windows", 512, "3.4")
    public Windows (String os, int memory, String edgeVersion){
        //super(os, memory);
        this(os, memory); // this("Windows", 512)
        this.edgeVersion = edgeVersion;
    }



}