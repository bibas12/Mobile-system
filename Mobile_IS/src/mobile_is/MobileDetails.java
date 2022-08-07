/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobile_is;

/**
 *
 * @author ASUS
 */
public class MobileDetails {
    private String modelNumber;
    private String name;
    private String category;
    private String processor;
    private String memory;
    private String colour;
    private int price;

    public MobileDetails() {
    }

    public MobileDetails(String modelNumber, String name, String category, String processor, String memory, String colour, int price) {
        this.modelNumber = modelNumber;
        this.name = name;
        this.category = category;
        this.processor = processor;
        this.memory = memory;
        this.colour = colour;
        this.price = price;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getProcessor() {
        return processor;
    }

    public String getMemory() {
        return memory;
    }

    public String getColour() {
        return colour;
    }

    public int getPrice() {
        return price;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public int compareTo(MobileDetails mobile) {
        int response = 0;
        if (this.price < mobile.getPrice()) {
            response =- 1;
        }
        if (this.price > mobile.getPrice()) {
            response = 1;
        }
        return response;
    }
    
    public MobileDetails copyMobileDetails(){
        return new MobileDetails(this.modelNumber, this.name, this.category, this.processor, this.memory, this.colour, this.price);
    }
}
