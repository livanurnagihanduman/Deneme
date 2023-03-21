public class OtogarManagerDal {

    private String name;
    private String gender;
    private int age;
    private String firma;

    public OtogarManagerDal(String name,String gender,int age,String firma){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.firma = firma;
    }
    public String getname(){
        return name;
    }

    public void setname(){
        this.name = name;
    }

    public String getgender(){
        return gender;

    }

    public void setgender(){
        this.gender = gender;
    }

    public int age(){
        return age;
    }

    public void setage(){
        this.age = age;
    }
    public String getFirma(){
        return firma;
    }

    public void setFirma(){
        this.firma = firma;
    }

    public void firma(){
        System.out.println(this.name +  firma + " firmasından bilet almıştır.");
    }



}
