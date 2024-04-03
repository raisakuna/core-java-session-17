package interfaceindetails_Comparator;

public  class Director extends Manager {
    private int shares;

    public Director(int id, String name, double salary, double bonus, int shares){
        super(id,name,salary,bonus);
        this.shares=shares;
    }


}
