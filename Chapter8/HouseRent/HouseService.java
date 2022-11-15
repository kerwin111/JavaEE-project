package Chapter8.HouseRent;



public class HouseService {
    private House[] houses;
    private int houseNum = 1;
    private int idCounter = 1;

    public HouseService(int size){
        houses = new House[size];
        houses[0] = new House(1,"jack","123","柴桑区",1500,"未出租");
    }

    public boolean add(House newHouse){
        if (houseNum == houses.length){
            System.out.println("数组已满,请问是否需要扩容y/n");
            do {
                char answer = Utility.readChar();
                if (answer == 'y'){
                    House[] houses2 = new House[houses.length +1];
                    for (int i = 0; i < houses.length; i++) {
                        houses2[i] = houses[i];
                    }
                    houses = houses2;
                    break;

                }else if (answer == 'n'){
                    return false;

                }else {
                    System.out.println("请输入正确的字符y/n");
                    break;
                }

            }while (true);

        }
        houses[houseNum++] = newHouse;
        newHouse.setId(++idCounter);
        return true;
    }
    public House find(int findId){
        for (int i = 0; i < houseNum; i++) {
           if (findId == houses[i].getId()){
               return houses[i];
           }
        }
        return null;
    }

    public boolean del(int delId){
        int index = -1;
        for (int i = 0; i < houseNum; i++) {
            if (delId == houses[i].getId()){
                index = i;
            }
        }
        if (index == -1){
            return false;
        }

        for (int i = index; i < houseNum-1; i++) {
            houses[i] = houses[i+1];
        }
        houses[--houseNum] = null;
        return true;
    }

    public House[] List(){
        return houses;
    }

}
