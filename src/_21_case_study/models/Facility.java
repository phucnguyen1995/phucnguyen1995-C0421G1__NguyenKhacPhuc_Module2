package _21_case_study.models;

public abstract class Facility {
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

//     Villa palmVilla = new Villa("Palm villa No.01", "400", "30000000", 10, "Weekly pay", "Excellent", "30", 3);

//     -	Riêng loại Room sẽ có thêm thông tin:
//    Dịch vụ miễn phí đi kèm.


    //    -	Riêng loại House sẽ có thêm thông tin:
    //    Tiêu chuẩn phòng
    //    Số tầng



    protected String nameOfService;
    protected String usingArea;
    protected String price;
    protected int capacity;
    protected String typeOfHiring;

    public Facility() {
    }

    public String getNameOfService() {
        return nameOfService;
    }

    public void setNameOfService(String nameOfService) {

        this.nameOfService = nameOfService;
    }

    public String getUsingArea() {

        return usingArea;
    }

    public void setUsingArea(String usingArea) {
        this.usingArea = usingArea;
    }

    public String getPrice() {

        return price;
    }

    public void setPrice(String price) {

        this.price = price;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {

        this.capacity = capacity;
    }

    public String getTypeOfHiring() {
        return typeOfHiring;
    }

    public void setTypeOfHiring(String typeOfHiring) {

        this.typeOfHiring = typeOfHiring;
    }


    @Override
    public String toString() {
        return "Facility{" +
                "nameOfService='" + nameOfService + '\'' +
                ", usingArea=" + usingArea +
                ", price=" + price +
                ", capacity=" + capacity +
                ", typeOfHiring='" + typeOfHiring + '\'' +
                '}';
    }
}
