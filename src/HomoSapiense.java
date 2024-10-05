public class HomoSapiense {

    int weight;
    int height;
    String name;
    String gender;

    public HomoSapiense(int weight, int height, String name, String gender) {
        this.weight = weight;
        this.height = height;
        this.name = name;
        this.gender = gender;

    }

    public void showInfo(){
        System.out.printf("\nName: %s, gender: %s, height: %d, weight: %d\n",name,gender,height,weight);
    }
}
