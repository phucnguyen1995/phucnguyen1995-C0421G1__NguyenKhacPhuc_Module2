package _21_case_study.models;

import java.io.Serializable;

public class Contract implements Serializable {
//    Hợp đồng thuê sẽ bao gồm các thông tin:
//   1. Số hợp đồng,
//   2. mã booking,
//   3. Số tiền cọc trước,(deposit)
//   4.Tổng số tiền thanh toán,
//   5. mã khách hàng.

    private int contractNumb;
    private String bookingCode;
    private double deposit;
    private double totalPay;
    private String customerCode;

    public Contract(int contractNumb, String bookingCode, String customerCode, double deposit, double totalPay) {
        this.contractNumb = contractNumb;
        this.bookingCode = bookingCode;
        this.customerCode = customerCode;
        this.deposit = deposit;
        this.totalPay = totalPay;
    }

    public Contract() {
    }

    public int getContractNumb() {
        return contractNumb;
    }

    public void setContractNumb(int contractNumb) {
        this.contractNumb = contractNumb;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(double totalPay) {
        this.totalPay = totalPay;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractNumb=" + contractNumb +
                ", bookingCode='" + bookingCode + '\'' +
                ", customerCode='" + customerCode + '\'' +
                ", deposit=" + deposit +
                ", totalPay=" + totalPay +
                '}';
    }

}
