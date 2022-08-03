package com.example.casestudy.DTO;

import com.example.casestudy.model.CustomerModel.CustomerType;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;


public class CustomerDTO {
    private int customerId;

    private CustomerType customerType;

    @NotBlank(message = "")
    @Pattern(regexp = "^([A-Z][^A-Z0-9\\s]+)(\\s[A-Z][^A-Z0-9\\s]+)*$", message = "viết hoa chữ đầu")
    private String customerName;

    @NotEmpty
    private String dayOfBirth;


    private int gender;

    @NotBlank(message = "")
    @Pattern(regexp = "[0-9]{9}|[0-9]{12}",message = "valid(9 or 12 number)")
    private String customerIdCard;

    @NotBlank(message = "")
    @Pattern(regexp = "^(090|091|\\(84\\)\\+90|\\(84\\)\\+91)\\d{7}$", message = "phone valid")
    private String phoneNumber;

    @NotBlank(message = "Nhập vào đi bạn")
    @Email(message = "Email is not valid")
    private String customerEmail;
    private String address;

    public CustomerDTO() {
    }

    public CustomerDTO(int customerId, CustomerType customerType, String customerName, String dayOfBirth, int gender, String customerIdCard, String phoneNumber, String customerEmail, String address) {
        this.customerId = customerId;
        this.customerType = customerType;
        this.customerName = customerName;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.customerIdCard = customerIdCard;
        this.phoneNumber = phoneNumber;
        this.customerEmail = customerEmail;
        this.address = address;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getCustomerIdCard() {
        return customerIdCard;
    }

    public void setCustomerIdCard(String customerIdCard) {
        this.customerIdCard = customerIdCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
