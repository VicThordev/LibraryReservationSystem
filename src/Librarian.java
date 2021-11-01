import java.util.ArrayList;

class Librarian extends Admin {

 ArrayList<Librarian> arr = new ArrayList<>();

 public String getName() {
  System.out.println("Name: "+name);
  return name;
 }

 public String getPassWord() {
  System.out.println("Password: "+passWord);
  return passWord;
 }

 public String getEmail() {
  System.out.println("Email: "+email);
  return email;
 }

 public int getAddressNo() {
  System.out.println("Address No: "+addressNo);
  return addressNo;
 }
 public Librarian addLibrarian() {
  System.out.println("Enter the following details: ");
  System.out.print("Name: ");
  name= sca.nextLine();
  System.out.print("Password: ");
  passWord=sca.nextLine();
  System.out.print("Email address: ");
  email=sca.nextLine();
  System.out.print("Address No: ");
  addressNo=sca.nextInt();
  System.out.println("Librarian Added successfully");
  return null;
 }

 public Librarian addLib() {
  Librarian lib = new Librarian();
  lib.name=name;
  lib.setName(lib.name);
  lib.passWord=passWord;
  lib.setPassWord(lib.passWord);
  lib.email=email;
  lib.setEmail(lib.email);
  lib.addressNo=addressNo;
  lib.setAddressNo(lib.addressNo);
  arr.add(lib);


  Librarian lib1=new Librarian();
  lib1.name=name;
  lib1.setName(lib1.name);
  lib1.passWord=passWord;
  lib1.setPassWord(lib1.passWord);
  lib1.email=email;
  lib1.setEmail(lib1.email);
  lib1.addressNo=addressNo;
  lib1.setAddressNo(lib1.addressNo);
  arr.add(lib1);

  return null;
 }


public Librarian deleteLibrarian() {
 System.out.println("Do you want to delete a librarian?");
 System.out.println("1. Yes " +
         "2. No");
 byte delete= sca.nextByte();
 if (delete==1) {
  for (Librarian librarian: arr) {
   arr.remove(librarian);
   getName();
   getPassWord();
   getEmail();
   getAddressNo();
  }
 } else if (delete==2) System.out.println("Okay. No shit.");
 else System.out.println("Invalid input.");
 return null;
}
 }
