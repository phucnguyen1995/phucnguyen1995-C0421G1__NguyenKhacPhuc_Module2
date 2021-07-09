package _21_case_study.services;

import _21_case_study.models.Facility;
import _21_case_study.models.House;
import _21_case_study.models.Room;
import _21_case_study.models.Villa;
import _21_case_study.utils.FacilityReadAndWriteFile;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    //    Các loại dịch vụ này sẽ bao có các thông tin:
//    Tên dịch vụ,
//    Diện tích sử dụng
//    Chi phí thuê,
//    Số lượng người tối đa,
//    Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ.

//        -	Riêng loại Villa sẽ có thêm thông tin:
//    Tiêu chuẩn phòng,
//    Diện tích hồ bơi,
//    Số tầng.

//     -	Riêng loại Room sẽ có thêm thông tin:
//    Dịch vụ miễn phí đi kèm.


    //    -	Riêng loại House sẽ có thêm thông tin:
    //    Tiêu chuẩn phòng
    //    Số tầng

    static Scanner sc = new Scanner(System.in);
    private static LinkedHashMap<Facility, Integer> facilityMap = new LinkedHashMap<>();

//    DocGhiMap<Facility> docGhiMap=new DocGhiMap<>();

    private static final String FILE_PATH_VILLA = "src\\_21_case_study\\data\\Villa.csv";
    private static final String FILE_PATH_HOUSE = "src\\_21_case_study\\data\\House.csv";
    private static final String FILE_PATH_ROOM = "src\\_21_case_study\\data\\Room.csv";

    private static Map<Facility, Integer> villaMap = new LinkedHashMap<>();
    private static Map<Facility, Integer> houseMap = new LinkedHashMap<>();
    private static Map<Facility, Integer> roomMap = new LinkedHashMap<>();
    static FacilityReadAndWriteFile facilityReadAndWriteFile = new FacilityReadAndWriteFile();



    static {
//        Villa palmVilla = new Villa("Palm villa No.01", "400", "30000000", 10, "Weekly pay", "Excellent", "30", 3);
//        Villa cocoVilla = new Villa("Coconut villa No.02", "380", "35000000", 10, "Weekly pay", "Excellent", "30", 4);
//        House westHouse = new House("West house No.01", "120", "15000000", 4, "Daily pay", "Standard", 2);
//        House southHouse = new House("South house No.01", "100", "15000$", 4, "Annually pay", "Well", 1);
//        Room room101 = new Room("Room No.101", "50", "7000000", 2, "Daily pay", "Free drinks and breakfast everyday");
//        Room room102 = new Room("Room No.102", "50", "9000000", 2, "Daily pay", "Free drinks, breakfast and mudbath services");
//
        villaMap = facilityReadAndWriteFile.readFile(FILE_PATH_VILLA);
        houseMap = facilityReadAndWriteFile.readFile(FILE_PATH_HOUSE);
        roomMap = facilityReadAndWriteFile.readFile(FILE_PATH_ROOM);
        facilityMap.putAll(villaMap);
        facilityMap.putAll(houseMap);
        facilityMap.putAll(roomMap);



//   Ta tạo gắn cứng nhưng lưu ý value phải lớn hơn hoặc bằng 5 để khi chạy ko bị lỗi

//        facilityMap.put(palmVilla, 5);
//        facilityMap.put(cocoVilla, 3);
//        facilityMap.put(westHouse, 5);
//        facilityMap.put(southHouse, 2);
//        facilityMap.put(room101, 5);
//        facilityMap.put(room102, 4);

//        villaMap.put(palmVilla, 5);
//        villaMap.put(cocoVilla, 3);
//        houseMap.put(westHouse, 5);
//        houseMap.put(southHouse, 2);
//        roomMap.put(room101, 5);
//        roomMap.put(room102, 4);
    }




//    static {
//        houseMap=readwriteHouse.readFileByteStreamMap(fileHouse);
//        villaMap=readwriteVilla.readFileByteStreamMap(fileVilla);
//        roomMap=readwriteRoom.readFileByteStreamMap(fileRoom);
//    }

//    @Override
//    public void displayList() {
//        for (Map.Entry<Facility, Integer> entry : facilityMap.entrySet()) {
//            System.out.println(entry.getKey() + "\n"  + "Số lần sử dụng: " + entry.getValue());
//        }
//    }

    private static boolean checkFile(String path) {
        File file = new File(path);
        return file.exists();
    }

    @Override
    public void displayList() {
        if (facilityMap.isEmpty()) {
            System.out.println("Danh sách đang rỗng");
        } else {
            for (Map.Entry<Facility, Integer> element : facilityMap.entrySet()) {
                System.out.println("Service" + element.getKey() + "\n" + "Số lần sử dụng: " + element.getValue());
            }
        }
    }



    @Override
    public void addNew() {

        do {
//            khuc nay da co o Facility Controller
//            System.out.println("Chọn số tương ứng với mục bạn muốn thêm vào: ");
//            System.out.println("1) Add new villa");
//            System.out.println("2) Add new house");
//            System.out.println("3) Add new room");
//            System.out.println("4) Back to menu");

//            ta chinh lại thanh try cactch:
//            int addNewChoice = sc.nextInt();





            int addNewChoice = 0;
            try {
                addNewChoice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Input number only");
            }

            switch (addNewChoice) {
                case 1:
                    addNewVilla();
//                    System.out.println("Bạn chọn Add new villa.");
//                    Villa newVilla = new Villa();
//                    hamNhap(newVilla);
//                    System.out.println("Nhập tiêu chuẩn phòng: ");
//                    newVilla.setRoomStandard(sc.nextLine());
//                    System.out.println("Nhập diện tích hồ bơi ");
//                    newVilla.setPoolArea(sc.nextLine());
//                    System.out.println("Nhập số tầng");
//                    newVilla.setNumberOfLevel(Integer.parseInt(sc.nextLine()));
//
//                    villaMap.put(newVilla, 0);
//                    facilityMap.put(newVilla, 0);
//                    System.out.println("Bạn đã nhập thành công!");
//                    facilityReadAndWriteFile.writeFile(FILE_PATH_VILLA, villaMap);


                    break;

                case 2:
                    addNewHouse();

//                    System.out.println("Bạn chọn Add new house.");
//                    House newHouse = new House();
//                    hamNhap(newHouse);
//                    System.out.println("Nhập tiêu chuẩn phòng ");
//                    newHouse.setRoomStandard(sc.nextLine());
//
//                    System.out.println("Nhập số tầng");
//                    newHouse.setNumberOfLevel(Integer.parseInt(sc.nextLine()));
//
//                    houseMap.put(newHouse,0);
//                    facilityMap.put(newHouse, 0);
//                    facilityReadAndWriteFile.writeFile(FILE_PATH_HOUSE, houseMap);
//                    System.out.println("Bạn đã nhập thành công !");


                    break;

                case 3:
                    addNewRoom();
//                    System.out.println("Bạn chọn Add new room.");
//                    Room newRoom = new Room();
//                    hamNhap(newRoom);
//
//                    System.out.println("Nhập dịch vụ miễn phí đi kèm bạn muốn: ");
//                    newRoom.setFreeServices(sc.nextLine());
//
//                    roomMap.put(newRoom, 0);
//                    facilityMap.put(newRoom, 0);
//                    facilityReadAndWriteFile.writeFile(FILE_PATH_ROOM, roomMap);
//                    System.out.println("Bạn đã nhập thành công!");
                    break;

                case 4:
                    return;

                default:
                    System.err.println("Vui lòng nhập lại số nguyên từ 1 đến 4,");
            }
        } while (true);
    }

//    @Override
//    public void displayListMaintenance() {
//        System.err.println("Facilities need to maintain: ");
//        for (Map.Entry<Facility, Integer> entry : facilityMap.entrySet()) {
//            if (entry.getValue() >= 5) {
//                System.out.println(entry.getKey().getNameOfService() + ", số lần sử dụng: " + entry.getValue());
//            }
//        }
//    }



    @Override
    public void displayListMaintenance() {
        boolean noNeedToMaintain = false;
        for (Map.Entry<Facility, Integer> entry : facilityMap.entrySet()) {
            if (entry.getValue() >= 5) {
                System.out.println(entry.getKey().getNameOfService() + ", used times: " + entry.getValue());
            } else {
                noNeedToMaintain = true;
            }
        }
        if (noNeedToMaintain) {
            System.out.println("All facilities is ok!");
        }
    }

//    Tên dịch vụ,
//    Diện tích sử dụng
//    Chi phí thuê,
//    Số lượng người tối đa,
//    Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ.


    public void hamNhap(Facility f) {

//        cách 1 :chi tiết
//        System.out.println("Nhập tên dịch vụ bạn muốn ");
//        String name= sc.nextLine();
//        f.setNameOfService(name);
//        sc.nextLine();
//        cách 2:chúng ta có thể viết gọn như sau:
        System.out.println("Nhập tên dịch vụ bạn muốn ");
        f.setNameOfService(sc.nextLine());

        System.out.println("Nhập diện tích sử dụng: ");
        f.setUsingArea(sc.nextLine());

        System.out.println("Nhập chi phí thuê: ");
        f.setPrice(sc.nextLine());

        System.out.println("Nhập số lượng người tối đa ");
        f.setCapacity(Integer.parseInt(sc.nextLine()));

        System.out.println("Nhập kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ) : ");
        f.setTypeOfHiring(sc.nextLine());
    }




    public void addNewVilla() {
        if (checkFile(FILE_PATH_VILLA)) {
            facilityReadAndWriteFile.readFile(FILE_PATH_VILLA);
        }

        System.out.println("Bạn chọn Add new villa.");
        Villa newVilla = new Villa();
        hamNhap(newVilla);
        System.out.println("Nhập tiêu chuẩn phòng: ");
        newVilla.setRoomStandard(sc.nextLine());

        System.out.println("Nhập diện tích hồ bơi ");
        newVilla.setPoolArea(sc.nextLine());

        System.out.println("Nhập số tầng");
        newVilla.setNumberOfLevel(Integer.parseInt(sc.nextLine()));

        villaMap.put(newVilla, 0);
        facilityMap.put(newVilla, 0);
        System.out.println("Bạn đã nhập thành công!");
        facilityReadAndWriteFile.writeFile(FILE_PATH_VILLA, villaMap);
    }

    public void addNewHouse() {
        if (checkFile(FILE_PATH_HOUSE)) {
            facilityReadAndWriteFile.readFile(FILE_PATH_HOUSE);
        }

        System.out.println("Bạn chọn Add new house.");
        House newHouse = new House();
        hamNhap(newHouse);
        System.out.println("Nhập tiêu chuẩn phòng ");
        newHouse.setRoomStandard(sc.nextLine());

        System.out.println("Nhập số tầng");
        newHouse.setNumberOfLevel(Integer.parseInt(sc.nextLine()));

        houseMap.put(newHouse,0);
        facilityMap.put(newHouse, 0);
        facilityReadAndWriteFile.writeFile(FILE_PATH_HOUSE, houseMap);
        System.out.println("Bạn đã nhập thành công !");
    }

    public void addNewRoom() {
        if (checkFile(FILE_PATH_ROOM)) {
            facilityReadAndWriteFile.readFile(FILE_PATH_ROOM);
        }

        System.out.println("Bạn chọn Add new room.");
        Room newRoom = new Room();
        hamNhap(newRoom);

        System.out.println("Nhập dịch vụ miễn phí đi kèm bạn muốn: ");
        newRoom.setFreeServices(sc.nextLine());

        roomMap.put(newRoom, 0);
        facilityMap.put(newRoom, 0);
        facilityReadAndWriteFile.writeFile(FILE_PATH_ROOM, roomMap);
        System.out.println("Bạn đã nhập thành công!");
    }





    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
