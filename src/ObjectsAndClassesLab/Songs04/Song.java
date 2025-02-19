package ObjectsAndClassesLab.Songs04;
//Помощен клас.
//Задачата се решава в отделен клас (примерно main)
public class Song {

    private String typeList;
    private String name;
    private String time;

    //alt + insert (ins)

//конструктор
    public Song(String typeList, String name, String time) {
        this.typeList = typeList;
        this.name = name;
        this.time = time;
    }

//методи - getters and setters
    public String getTypeList() {
        return typeList;
    }

    public void setTypeList(String typeList) {
        this.typeList = typeList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
