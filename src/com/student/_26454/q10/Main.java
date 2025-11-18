package com.student._26454.q10;

import java.util.Scanner;

public class Main {
    private static final String STUDENT_ID = "26454";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println(STUDENT_ID + " === ONLINE SHOPPING SYSTEM - DATA ENTRY ===");
            
            System.out.print(STUDENT_ID + " Enter ID: ");
            long id = scanner.nextLong();
            scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Created Date: ");
            String createdDate = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Updated Date: ");
            String updatedDate = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Store Name: ");
            String storeName = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Store Address: ");
            String address = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Store Email: ");
            String email = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Category Name: ");
            String categoryName = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Category Code (>=3 chars): ");
            String categoryCode = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Product Name: ");
            String productName = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Product Code: ");
            String productCode = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Customer Name: ");
            String customerName = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Contact Number: ");
            String contactNumber = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Customer Address: ");
            String customerAddress = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Order Date: ");
            String orderDate = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Order ID: ");
            String orderId = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Payment Method: ");
            String paymentMethod = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Payment Status: ");
            String paymentStatus = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Shipping Address: ");
            String shippingAddress = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Shipping Cost: ");
            double shippingCost = scanner.nextDouble();
            
            System.out.print(STUDENT_ID + " Enter Total Amount: ");
            double totalAmount = scanner.nextDouble();
            
            OrderRecord record = new OrderRecord(id, createdDate, updatedDate, storeName,
                address, email, categoryName, categoryCode, productName, productCode, price,
                customerName, contactNumber, customerAddress, orderDate, orderId,
                paymentMethod, paymentStatus, shippingAddress, shippingCost, totalAmount);
            
            record.displayAllDetails();
            
        } catch (ShoppingDataException e) {
            System.out.println(STUDENT_ID + " ERROR: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(STUDENT_ID + " ERROR: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}

