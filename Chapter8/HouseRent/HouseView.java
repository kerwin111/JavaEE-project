package Chapter8.HouseRent;


public class HouseView {
    private boolean loop = true;
    private char key = ' ';
    HouseService houseService = new HouseService(10);


    public void addHouse(){
        System.out.println("请输入房屋信息:");
        System.out.print("姓名:");
        String name = Utility.readString(8);
        System.out.print("电话:");
        String phone = Utility.readString(11);
        System.out.print("地址:");
        String address = Utility.readString(16);
        System.out.print("租金:");
        int rent = Utility.readInt(5);
        System.out.print("状态(未出租/已出租):");
        String state = Utility.readString(3);

        House newHouse = new House(0,name,phone,address,rent,state);
        if (houseService.add(newHouse)){
            System.out.println("=====房屋添加成功=====");
        }else {
            System.out.println("=====房屋添加失败=====");
        }
    }

    public void find(){
        System.out.println("请输入要查找房屋信息的id:");
        int findId = Utility.readInt();
        House house = houseService.find(findId);
        if (house != null){
            System.out.println(house);
        }else {
            System.out.println("查找失败");
        }
    }

    public void delHouse(){
        System.out.println("=====删除房屋信息=====");
        System.out.println("请输入待删除的房屋信息(-1)退出");
        int delId = Utility.readInt();
        if (delId == -1){
            System.out.println("放弃删除房屋信息");
            return;
        }
        char choose = Utility.readConfirmSelection();
        if (choose == 'Y'){
            if (houseService.del(delId)){
                System.out.println("删除房屋信息成功");
            }else {
                System.out.println("房屋信息不存在,删除失败");
            }
        }
    }

    public void Update(){
        System.out.println("=======房屋信息列表显示=======");
        System.out.println("请选择待修改房屋编号(-1表示退出)");
        int UpdateId = Utility.readInt();
        if (UpdateId == -1){
            System.out.println("你放弃了修改房屋信息");
            return;
        }
        House house = houseService.find(UpdateId);
        if (house == null){
            System.out.println("修改信息编号有误");
            return;
        }
        System.out.print("姓名("+house.getName()+"):");
        String name = Utility.readString(8,"");
        if (!"".equals(name)){
            house.setName(name);
        }

        System.out.print("电话("+house.getPhone()+"):");
        String phone = Utility.readString(12,"");
        if (!"".equals(phone)){
            house.setPhone(phone);
        }

        System.out.print("地址("+house.getAddress()+"):");
        String address = Utility.readString(8,"");
        if (!"".equals(address)){
            house.setAddress(address);
        }

        System.out.print("租金("+house.getRent()+"):");
        int rent = Utility.readInt(-1);
        if (rent != -1){
            house.setRent(rent);
        }

        System.out.print("状态("+house.getState()+"):");
        String state = Utility.readString(8,"");
        if (!"".equals(state)){
            house.setState(state);
        }
    }

    public void ListHouse(){
        System.out.println("\n=======房屋列表显示=======");
        System.out.println("编号\t\t名字\t\t电话\t\t地址\t\t租金\t\t状态(未出租/已出租)");
        House[] houses = houseService.List();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null){
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("======房屋显示完毕======");
    }

    public void exit(){
        char choose = Utility.readConfirmSelection();
        if (choose == 'Y'){
            loop = false;
        }
    }

    public void mainMenu(){
        do {
            System.out.println("===========房屋出租系统===========");
            System.out.println("\t\t\t1.新增房屋信息");
            System.out.println("\t\t\t2.查找房屋信息");
            System.out.println("\t\t\t3.删改房屋信息");
            System.out.println("\t\t\t4.修改房屋信息");
            System.out.println("\t\t\t5.显示房屋信息");
            System.out.println("\t\t\t6.退       出");
            System.out.println("请输入1-6:");
            key = Utility.readChar();
            switch (key){
                case '1':
                    addHouse();
                    break;
                case '2':
                    find();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    Update();
                    break;
                case '5':
                    ListHouse();
                    break;
                case '6':
                    exit();
                    break;
            }
        }while (loop);
    }

}
