package Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.AccountantRole;
import Business.Role.CustomerRole;
import Business.Role.CVSAdminRole;
import Business.Role.ManagerRole;
import Business.Role.PurchasingRole;
import Business.Role.ReceivingRole;
import Business.Role.SendingRole;
import Business.Role.DeliveryPlatformAdminRole;
import Business.Role.SupplyFactoryAdminRole;
import Business.Role.SupplierRole;
import Business.Role.SystemAdminRole;
import Business.Role.PublicDepartRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Bo
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
//        Network boston = system.createAndAddNetwork();
//        Network beijing = system.createAndAddNetwork();
//        boston.setName("boston");
//        beijing.setName("beijing");
//        
//        Enterprise bosEnterShipping1 = boston.getEnterpriseDirectory().createAndAddEnterprise("bosEnterShipping1", Enterprise.EnterpriseType.DeliveryPlatform);
//        Enterprise bosEnterShipping2 = boston.getEnterpriseDirectory().createAndAddEnterprise("bosEnterShipping2", Enterprise.EnterpriseType.DeliveryPlatform);
//        
//        Enterprise bosEnterSupplier1 = boston.getEnterpriseDirectory().createAndAddEnterprise("bosEnterSupplier1", Enterprise.EnterpriseType.SupplyFactory);
//        Enterprise bosEnterSupplier2 = boston.getEnterpriseDirectory().createAndAddEnterprise("bosEnterSupplier2", Enterprise.EnterpriseType.SupplyFactory);
//        
//        Enterprise bosEnterGrocery1 = boston.getEnterpriseDirectory().createAndAddEnterprise("bosEnterGrocery1", Enterprise.EnterpriseType.CVS);
//        
//        
//        UserAccount bg1 = bosEnterGrocery1.getUserAccountDirectory().createUserAccount("bg1", "bg1", bosEnterGrocery1.getEmployeeDirectory().createEmployee("bg1"), new CVSAdminRole());
//        
//        UserAccount bs1 = bosEnterSupplier1.getUserAccountDirectory().createUserAccount("bs1", "bs1", bosEnterSupplier1.getEmployeeDirectory().createEmployee("bs1"), new SupplyFactoryAdminRole());
//        UserAccount bs2 = bosEnterSupplier2.getUserAccountDirectory().createUserAccount("bs2", "bs2", bosEnterSupplier2.getEmployeeDirectory().createEmployee("bs2"), new SupplyFactoryAdminRole());
//        
//        UserAccount bsh1 = bosEnterShipping1.getUserAccountDirectory().createUserAccount("bsh1", "bsh1", bosEnterShipping1.getEmployeeDirectory().createEmployee("bsh1"), new DeliveryPlatformAdminRole());
//        UserAccount bsh2 = bosEnterShipping2.getUserAccountDirectory().createUserAccount("bsh2", "bsh2", bosEnterShipping2.getEmployeeDirectory().createEmployee("bsh2"), new DeliveryPlatformAdminRole());
//        
//        //Shipping Enterprise
//        //Receiving Organization
//        Organization bosOrgReceiving11 = bosEnterShipping1.getOrganizationDirectory().createOrganization(Organization.Type.Receiving);
//        Organization bosOrgReceiving12 = bosEnterShipping1.getOrganizationDirectory().createOrganization(Organization.Type.Receiving);
//        
//        Organization bosOrgReceiving21 = bosEnterShipping2.getOrganizationDirectory().createOrganization(Organization.Type.Receiving);
//        Organization bosOrgReceiving22 = bosEnterShipping2.getOrganizationDirectory().createOrganization(Organization.Type.Receiving);
//        
//        //Sending Organization
//        Organization bosOrgSending11 = bosEnterShipping1.getOrganizationDirectory().createOrganization(Organization.Type.Sending);
//        Organization bosOrgSending12 = bosEnterShipping1.getOrganizationDirectory().createOrganization(Organization.Type.Sending);
//        
//        Organization bosOrgSending21 = bosEnterShipping2.getOrganizationDirectory().createOrganization(Organization.Type.Sending);
//        Organization bosOrgSending22 = bosEnterShipping2.getOrganizationDirectory().createOrganization(Organization.Type.Sending);
//        
//        //Supplier Enterprise
//        //Accountnt Organization
//        Organization bosOrgAccountant11 = bosEnterSupplier1.getOrganizationDirectory().createOrganization(Organization.Type.AccountingDepart);
//        Organization bosOrgAccountant12 = bosEnterSupplier1.getOrganizationDirectory().createOrganization(Organization.Type.AccountingDepart);
//        
//        Organization bosOrgAccountant21 = bosEnterSupplier2.getOrganizationDirectory().createOrganization(Organization.Type.AccountingDepart);
//        Organization bosOrgAccountant22 = bosEnterSupplier2.getOrganizationDirectory().createOrganization(Organization.Type.AccountingDepart);
//        
//        //Tally Organization
//        Organization bosOrgTally11 = bosEnterSupplier1.getOrganizationDirectory().createOrganization(Organization.Type.PublicDepart);
//        Organization bosOrgTally12 = bosEnterSupplier1.getOrganizationDirectory().createOrganization(Organization.Type.PublicDepart);
//        
//        Organization bosOrgTally21 = bosEnterSupplier2.getOrganizationDirectory().createOrganization(Organization.Type.PublicDepart);
//        Organization bosOrgTally22 = bosEnterSupplier2.getOrganizationDirectory().createOrganization(Organization.Type.PublicDepart);
//        
//        //Supplier Organization
//        Organization bosOrgSupplier11 = bosEnterSupplier1.getOrganizationDirectory().createOrganization(Organization.Type.Supplier);
//        Organization bosOrgSupplier12 = bosEnterSupplier1.getOrganizationDirectory().createOrganization(Organization.Type.Supplier);
//        
//        Organization bosOrgSupplier21 = bosEnterSupplier2.getOrganizationDirectory().createOrganization(Organization.Type.Supplier);
//        Organization bosOrgSupplier22 = bosEnterSupplier2.getOrganizationDirectory().createOrganization(Organization.Type.Supplier);
//        
//        //Grocery Store
//        //manager Organization
//        Organization bosOrgManager11 = bosEnterGrocery1.getOrganizationDirectory().createOrganization(Organization.Type.Manager);
//        Organization bosOrgManager12 = bosEnterGrocery1.getOrganizationDirectory().createOrganization(Organization.Type.Manager);
//        //customer Organization
//        Organization bosOrgCustomer11 = bosEnterGrocery1.getOrganizationDirectory().createOrganization(Organization.Type.Customers);
//        
//        //Purchasing Organization
//        Organization bosOrgPurchasing11 = bosEnterGrocery1.getOrganizationDirectory().createOrganization(Organization.Type.Purchasing);
//        Organization bosOrgPurchasing12 = bosEnterGrocery1.getOrganizationDirectory().createOrganization(Organization.Type.Purchasing);
//        
//        //Employee
//        //Receiver
//        Employee bosO11Receive1 = bosOrgReceiving11.getEmployeeDirectory().createEmployee("bosO11Receive1");
//        bosOrgReceiving11.getUserAccountDirectory().createUserAccount("bosO11Receive1", "bosO11Receive1", bosO11Receive1, new ReceivingRole());
//        
//        Employee bosO12Receive1 = bosOrgReceiving12.getEmployeeDirectory().createEmployee("bosO12Receive1");
//        bosOrgReceiving12.getUserAccountDirectory().createUserAccount("bosO12Receive1", "bosO12Receive1", bosO12Receive1, new ReceivingRole());
//        
//        Employee bosO21Receive1 = bosOrgReceiving21.getEmployeeDirectory().createEmployee("bosO21Receive1");
//        bosOrgReceiving21.getUserAccountDirectory().createUserAccount("bosO21Receive1", "bosO21Receive1", bosO21Receive1, new ReceivingRole());
//        
//        Employee bosO22Receive1 = bosOrgReceiving22.getEmployeeDirectory().createEmployee("bosO22Receive1");
//        bosOrgReceiving22.getUserAccountDirectory().createUserAccount("bosO22Receive1", "bosO22Receive1", bosO22Receive1, new ReceivingRole());
//        
//        
//        //Sender        
//        Employee bosO11Send1 = bosOrgSending11.getEmployeeDirectory().createEmployee("bosO11Send1");
//        bosOrgSending11.getUserAccountDirectory().createUserAccount("bosO11Send1", "bosO11Send1", bosO11Send1, new SendingRole());
//        
//        Employee bosO12Send1 = bosOrgSending12.getEmployeeDirectory().createEmployee("bosO12Send1");
//        bosOrgSending12.getUserAccountDirectory().createUserAccount("bosO12Send1", "bosO12Send1", bosO12Send1, new SendingRole());
//        
//        Employee bosO21Send1 = bosOrgSending21.getEmployeeDirectory().createEmployee("bosO21Send1");
//        bosOrgSending21.getUserAccountDirectory().createUserAccount("bosO21Send1", "bosO21Send1", bosO21Send1, new SendingRole());
//        
//        Employee bosO22Send1 = bosOrgSending22.getEmployeeDirectory().createEmployee("bosO22Send1");
//        bosOrgSending22.getUserAccountDirectory().createUserAccount("bosO22Send1", "bosO22Send1", bosO22Send1, new SendingRole());
//        
//           
//        //Accountants
//        Employee bosO11Accountant1 = bosOrgAccountant11.getEmployeeDirectory().createEmployee("bosO11Accountant1");
//        bosOrgAccountant11.getUserAccountDirectory().createUserAccount("bosO11Accountant1", "bosO11Accountant1", bosO11Accountant1, new AccountantRole());
//        
//        Employee bosO12Accountant1 = bosOrgAccountant12.getEmployeeDirectory().createEmployee("bosO12Accountant1");
//        bosOrgAccountant12.getUserAccountDirectory().createUserAccount("bosO12Accountant1", "bosO12Accountant1", bosO12Accountant1, new AccountantRole());
//        
//        Employee bosO21Accountant1 = bosOrgAccountant21.getEmployeeDirectory().createEmployee("bosO21Accountant1");
//        bosOrgAccountant21.getUserAccountDirectory().createUserAccount("bosO21Accountant1", "bosO21Accountant1", bosO21Accountant1, new AccountantRole());
//        
//        Employee bosO22Accountant1 = bosOrgAccountant22.getEmployeeDirectory().createEmployee("bosO22Accountant1");
//        bosOrgAccountant22.getUserAccountDirectory().createUserAccount("bosO22Accountant1", "bosO22Accountant1", bosO22Accountant1, new AccountantRole());
//       
//        //Tally
//        Employee bosO11Tally1 = bosOrgTally11.getEmployeeDirectory().createEmployee("bosO11Tally1");
//        bosOrgTally11.getUserAccountDirectory().createUserAccount("bosO11Tally1", "bosO11Tally1", bosO11Tally1, new PublicDepartRole());
//        
//        Employee bosO12Tally1 = bosOrgTally12.getEmployeeDirectory().createEmployee("bosO12Tally1");
//        bosOrgTally12.getUserAccountDirectory().createUserAccount("bosO12Tally1", "bosO12Tally1", bosO12Tally1, new PublicDepartRole());
//       
//        Employee bosO21Tally1 = bosOrgTally21.getEmployeeDirectory().createEmployee("bosO21Tally1");
//        bosOrgTally21.getUserAccountDirectory().createUserAccount("bosO21Tally1", "bosO21Tally1", bosO21Tally1, new PublicDepartRole());
//        
//        Employee bosO22Tally1 = bosOrgTally22.getEmployeeDirectory().createEmployee("bosO22Tally1");
//        bosOrgTally22.getUserAccountDirectory().createUserAccount("bosO22Tally1", "bosO22Tally1", bosO22Tally1, new PublicDepartRole());
//       
//        
//        //Suppliers
//        Employee bosO11Supplier1 = bosOrgSupplier11.getEmployeeDirectory().createEmployee("bosO11Supplier1");
//        bosOrgSupplier11.getUserAccountDirectory().createUserAccount("bosO11Supplier1", "bosO11Supplier1", bosO11Supplier1, new SupplierRole());
//        
//        Employee bosO12Supplier1 = bosOrgSupplier12.getEmployeeDirectory().createEmployee("bosO12Supplier1");
//        bosOrgSupplier12.getUserAccountDirectory().createUserAccount("bosO12Supplier1", "bosO12Supplier1", bosO12Supplier1, new SupplierRole());
//        
//        Employee bosO21Supplier1 = bosOrgSupplier21.getEmployeeDirectory().createEmployee("bosO21Supplier1");
//        bosOrgSupplier21.getUserAccountDirectory().createUserAccount("bosO21Supplier1", "bosO21Supplier1", bosO21Supplier1, new SupplierRole());
//        
//        Employee bosO22Supplier1 = bosOrgSupplier22.getEmployeeDirectory().createEmployee("bosO22Supplier1");
//        bosOrgSupplier22.getUserAccountDirectory().createUserAccount("bosO22Supplier1", "bosO22Supplier1", bosO22Supplier1, new SupplierRole());
//        
//        //Managers
//        Employee bosO11Manager1 = bosOrgManager11.getEmployeeDirectory().createEmployee("bosO11Manager1");
//        bosOrgManager11.getUserAccountDirectory().createUserAccount("bosO11Manager1", "bosO11Manager1", bosO11Manager1, new ManagerRole());
//        
//        Employee bosO12Manager1 = bosOrgManager12.getEmployeeDirectory().createEmployee("bosO12Manager1");
//        bosOrgManager12.getUserAccountDirectory().createUserAccount("bosO12Manager1", "bosO12Manager1", bosO12Manager1, new ManagerRole());
//        
//        //Purchasers
//        Employee bosO11Purchaser1 = bosOrgPurchasing11.getEmployeeDirectory().createEmployee("bosO11Purchaser1");
//        bosOrgPurchasing11.getUserAccountDirectory().createUserAccount("bosO11Purchaser1", "bosO11Purchaser1", bosO11Purchaser1, new PurchasingRole());
//        
//        Employee bosO12Purchaser1 = bosOrgPurchasing12.getEmployeeDirectory().createEmployee("bosO12Purchaser1");
//        bosOrgPurchasing12.getUserAccountDirectory().createUserAccount("bosO12Purchaser1", "bosO12Purchaser1", bosO12Purchaser1, new PurchasingRole());
//        
//        //Customers
//        Employee liuSh = bosOrgCustomer11.getEmployeeDirectory().createEmployee("liuSh");
//        bosOrgCustomer11.getUserAccountDirectory().createUserAccount("liuSh", "liuSh", liuSh, new CustomerRole());
//        
//        Employee dongXt = bosOrgCustomer11.getEmployeeDirectory().createEmployee("dongXt");
//        bosOrgCustomer11.getUserAccountDirectory().createUserAccount("dongXt", "dongXt", dongXt, new CustomerRole());
//        
//         //beijing network
//        Enterprise bjEnterShipping1 = beijing.getEnterpriseDirectory().createAndAddEnterprise("bjEnterShipping1", Enterprise.EnterpriseType.DeliveryPlatform);
//        Enterprise bjEnterShipping2 = beijing.getEnterpriseDirectory().createAndAddEnterprise("bjEnterShipping2", Enterprise.EnterpriseType.DeliveryPlatform);
//        
//        Enterprise bjEnterSupplier1 = beijing.getEnterpriseDirectory().createAndAddEnterprise("bjEnterSupplier1", Enterprise.EnterpriseType.SupplyFactory);
//        Enterprise bjEnterSupplier2 = beijing.getEnterpriseDirectory().createAndAddEnterprise("bjEnterSupplier2", Enterprise.EnterpriseType.SupplyFactory);
//        
//        Enterprise bjEnterGrocery1 = beijing.getEnterpriseDirectory().createAndAddEnterprise("bjEnterGrocery1", Enterprise.EnterpriseType.CVS);
//        
//        
//        UserAccount bjg1 = bjEnterGrocery1.getUserAccountDirectory().createUserAccount("bjg1", "bjg1", bjEnterGrocery1.getEmployeeDirectory().createEmployee("bjg1"), new CVSAdminRole());
//        
//        UserAccount bjs1 = bjEnterSupplier1.getUserAccountDirectory().createUserAccount("bjs1", "bjs1", bjEnterSupplier1.getEmployeeDirectory().createEmployee("bjs1"), new SupplyFactoryAdminRole());
//        UserAccount bjs2 = bjEnterSupplier2.getUserAccountDirectory().createUserAccount("bjs2", "bjs2", bjEnterSupplier2.getEmployeeDirectory().createEmployee("bjs2"), new SupplyFactoryAdminRole());
//        
//        UserAccount bjsh1 = bjEnterShipping1.getUserAccountDirectory().createUserAccount("bjsh1", "bjsh1", bjEnterShipping1.getEmployeeDirectory().createEmployee("bjsh1"), new DeliveryPlatformAdminRole());
//        UserAccount bjsh2 = bjEnterShipping2.getUserAccountDirectory().createUserAccount("bjsh2", "bjsh2", bjEnterShipping2.getEmployeeDirectory().createEmployee("bjsh2"), new DeliveryPlatformAdminRole());
//        
//        //Shipping Enterprise
//        //Receiving Organization
//        Organization bjOrgReceiving11 = bjEnterShipping1.getOrganizationDirectory().createOrganization(Organization.Type.Receiving);
//        Organization bjOrgReceiving12 = bjEnterShipping1.getOrganizationDirectory().createOrganization(Organization.Type.Receiving);
//        
//        Organization bjOrgReceiving21 = bjEnterShipping2.getOrganizationDirectory().createOrganization(Organization.Type.Receiving);
//        Organization bjOrgReceiving22 = bjEnterShipping2.getOrganizationDirectory().createOrganization(Organization.Type.Receiving);
//        
//        //Sending Organization
//        Organization bjOrgSending11 = bjEnterShipping1.getOrganizationDirectory().createOrganization(Organization.Type.Sending);
//        Organization bjOrgSending12 = bjEnterShipping1.getOrganizationDirectory().createOrganization(Organization.Type.Sending);
//        
//        Organization bjOrgSending21 = bjEnterShipping2.getOrganizationDirectory().createOrganization(Organization.Type.Sending);
//        Organization bjOrgSending22 = bjEnterShipping2.getOrganizationDirectory().createOrganization(Organization.Type.Sending);
//        
//        //Supplier Enterprise
//        //Accountnt Organization
//        Organization bjOrgAccountant11 = bjEnterSupplier1.getOrganizationDirectory().createOrganization(Organization.Type.AccountingDepart);
//        Organization bjOrgAccountant12 = bjEnterSupplier1.getOrganizationDirectory().createOrganization(Organization.Type.AccountingDepart);
//        
//        Organization bjOrgAccountant21 = bjEnterSupplier2.getOrganizationDirectory().createOrganization(Organization.Type.AccountingDepart);
//        Organization bjOrgAccountant22 = bjEnterSupplier2.getOrganizationDirectory().createOrganization(Organization.Type.AccountingDepart);
//        
//        //Tally Organization
//        Organization bjOrgTally11 = bjEnterSupplier1.getOrganizationDirectory().createOrganization(Organization.Type.PublicDepart);
//        Organization bjOrgTally12 = bjEnterSupplier1.getOrganizationDirectory().createOrganization(Organization.Type.PublicDepart);
//        
//        Organization bjOrgTally21 = bjEnterSupplier2.getOrganizationDirectory().createOrganization(Organization.Type.PublicDepart);
//        Organization bjOrgTally22 = bjEnterSupplier2.getOrganizationDirectory().createOrganization(Organization.Type.PublicDepart);
//        
//        //Supplier Organization
//        Organization bjOrgSupplier11 = bjEnterSupplier1.getOrganizationDirectory().createOrganization(Organization.Type.Supplier);
//        Organization bjOrgSupplier12 = bjEnterSupplier1.getOrganizationDirectory().createOrganization(Organization.Type.Supplier);
//        
//        Organization bjOrgSupplier21 = bjEnterSupplier2.getOrganizationDirectory().createOrganization(Organization.Type.Supplier);
//        Organization bjOrgSupplier22 = bjEnterSupplier2.getOrganizationDirectory().createOrganization(Organization.Type.Supplier);
//        
//        //Grocery Store
//        //manager Organization
//        Organization bjOrgManager11 = bjEnterGrocery1.getOrganizationDirectory().createOrganization(Organization.Type.Manager);
//        Organization bjOrgManager12 = bjEnterGrocery1.getOrganizationDirectory().createOrganization(Organization.Type.Manager);
//        //customer Organization
//        Organization bjOrgCustomer11 = bjEnterGrocery1.getOrganizationDirectory().createOrganization(Organization.Type.Customers);
//        
//        //Purchasing Organization
//        Organization bjOrgPurchasing11 = bjEnterGrocery1.getOrganizationDirectory().createOrganization(Organization.Type.Purchasing);
//        Organization bjOrgPurchasing12 = bjEnterGrocery1.getOrganizationDirectory().createOrganization(Organization.Type.Purchasing);
//        
//        //Employee
//        //Receiver
//        Employee bjO11Receive1 = bjOrgReceiving11.getEmployeeDirectory().createEmployee("bjO11Receive1");
//        bjOrgReceiving11.getUserAccountDirectory().createUserAccount("bjO11Receive1", "bjO11Receive1", bjO11Receive1, new ReceivingRole());
//        
//        Employee bjO12Receive1 = bjOrgReceiving12.getEmployeeDirectory().createEmployee("bjO12Receive1");
//        bjOrgReceiving12.getUserAccountDirectory().createUserAccount("bjO12Receive1", "bjO12Receive1", bjO12Receive1, new ReceivingRole());
//        
//        Employee bjO21Receive1 = bjOrgReceiving21.getEmployeeDirectory().createEmployee("bjO21Receive1");
//        bjOrgReceiving21.getUserAccountDirectory().createUserAccount("bjO21Receive1", "bjO21Receive1", bjO21Receive1, new ReceivingRole());
//        
//        Employee bjO22Receive1 = bjOrgReceiving22.getEmployeeDirectory().createEmployee("bjO22Receive1");
//        bjOrgReceiving22.getUserAccountDirectory().createUserAccount("bjO22Receive1", "bjO22Receive1", bjO22Receive1, new ReceivingRole());
//        
//        
//        //Sender        
//        Employee bjO11Send1 = bjOrgSending11.getEmployeeDirectory().createEmployee("bjO11Send1");
//        bjOrgSending11.getUserAccountDirectory().createUserAccount("bjO11Send1", "bjO11Send1", bjO11Send1, new SendingRole());
//        
//        Employee bjO12Send1 = bjOrgSending12.getEmployeeDirectory().createEmployee("bjO12Send1");
//        bjOrgSending12.getUserAccountDirectory().createUserAccount("bjO12Send1", "bjO12Send1", bjO12Send1, new SendingRole());
//        
//        Employee bjO21Send1 = bjOrgSending21.getEmployeeDirectory().createEmployee("bjO21Send1");
//        bjOrgSending21.getUserAccountDirectory().createUserAccount("bjO21Send1", "bjO21Send1", bjO21Send1, new SendingRole());
//        
//        Employee bjO22Send1 = bjOrgSending22.getEmployeeDirectory().createEmployee("bjO22Send1");
//        bjOrgSending22.getUserAccountDirectory().createUserAccount("bjO22Send1", "bjO22Send1", bjO22Send1, new SendingRole());
//        
//           
//        //Accountants
//        Employee bjO11Accountant1 = bjOrgAccountant11.getEmployeeDirectory().createEmployee("bjO11Accountant1");
//        bjOrgAccountant11.getUserAccountDirectory().createUserAccount("bjO11Accountant1", "bjO11Accountant1", bjO11Accountant1, new AccountantRole());
//        
//        Employee bjO12Accountant1 = bjOrgAccountant12.getEmployeeDirectory().createEmployee("bjO12Accountant1");
//        bjOrgAccountant12.getUserAccountDirectory().createUserAccount("bjO12Accountant1", "bjO12Accountant1", bjO12Accountant1, new AccountantRole());
//        
//        Employee bjO21Accountant1 = bjOrgAccountant21.getEmployeeDirectory().createEmployee("bjO21Accountant1");
//        bjOrgAccountant21.getUserAccountDirectory().createUserAccount("bjO21Accountant1", "bjO21Accountant1", bjO21Accountant1, new AccountantRole());
//        
//        Employee bjO22Accountant1 = bjOrgAccountant22.getEmployeeDirectory().createEmployee("bjO22Accountant1");
//        bjOrgAccountant22.getUserAccountDirectory().createUserAccount("bjO22Accountant1", "bjO22Accountant1", bjO22Accountant1, new AccountantRole());
//       
//        //Tally
//        Employee bjO11Tally1 = bjOrgTally11.getEmployeeDirectory().createEmployee("bjO11Tally1");
//        bjOrgTally11.getUserAccountDirectory().createUserAccount("bjO11Tally1", "bjO11Tally1", bjO11Tally1, new PublicDepartRole());
//        
//        Employee bjO12Tally1 = bjOrgTally12.getEmployeeDirectory().createEmployee("bjO12Tally1");
//        bjOrgTally12.getUserAccountDirectory().createUserAccount("bjO12Tally1", "bjO12Tally1", bjO12Tally1, new PublicDepartRole());
//       
//        Employee bjO21Tally1 = bjOrgTally21.getEmployeeDirectory().createEmployee("bjO21Tally1");
//        bjOrgTally21.getUserAccountDirectory().createUserAccount("bjO21Tally1", "bjO21Tally1", bjO21Tally1, new PublicDepartRole());
//        
//        Employee bjO22Tally1 = bjOrgTally22.getEmployeeDirectory().createEmployee("bjO22Tally1");
//        bjOrgTally22.getUserAccountDirectory().createUserAccount("bjO22Tally1", "bjO22Tally1", bjO22Tally1, new PublicDepartRole());
//       
//        
//        //Suppliers
//        Employee bjO11Supplier1 = bjOrgSupplier11.getEmployeeDirectory().createEmployee("bjO11Supplier1");
//        bjOrgSupplier11.getUserAccountDirectory().createUserAccount("bjO11Supplier1", "bjO11Supplier1", bjO11Supplier1, new SupplierRole());
//        
//        Employee bjO12Supplier1 = bjOrgSupplier12.getEmployeeDirectory().createEmployee("bjO12Supplier1");
//        bjOrgSupplier12.getUserAccountDirectory().createUserAccount("bjO12Supplier1", "bjO12Supplier1", bjO12Supplier1, new SupplierRole());
//        
//        Employee bjO21Supplier1 = bjOrgSupplier21.getEmployeeDirectory().createEmployee("bjO21Supplier1");
//        bjOrgSupplier21.getUserAccountDirectory().createUserAccount("bjO21Supplier1", "bjO21Supplier1", bjO21Supplier1, new SupplierRole());
//        
//        Employee bjO22Supplier1 = bjOrgSupplier22.getEmployeeDirectory().createEmployee("bjO22Supplier1");
//        bjOrgSupplier22.getUserAccountDirectory().createUserAccount("bjO22Supplier1", "bjO22Supplier1", bjO22Supplier1, new SupplierRole());
//        
//        //Managers
//        Employee bjO11Manager1 = bjOrgManager11.getEmployeeDirectory().createEmployee("bjO11Manager1");
//        bjOrgManager11.getUserAccountDirectory().createUserAccount("bjO11Manager1", "bjO11Manager1", bjO11Manager1, new ManagerRole());
//        
//        Employee bjO12Manager1 = bjOrgManager12.getEmployeeDirectory().createEmployee("bjO12Manager1");
//        bjOrgManager12.getUserAccountDirectory().createUserAccount("bjO12Manager1", "bjO12Manager1", bjO12Manager1, new ManagerRole());
//        
//        //Purchasers
//        Employee bjO11Purchaser1 = bjOrgPurchasing11.getEmployeeDirectory().createEmployee("bjO11Purchaser1");
//        bjOrgPurchasing11.getUserAccountDirectory().createUserAccount("bjO11Purchaser1", "bjO11Purchaser1", bjO11Purchaser1, new PurchasingRole());
//        
//        Employee bjO12Purchaser1 = bjOrgPurchasing12.getEmployeeDirectory().createEmployee("bjO12Purchaser1");
//        bjOrgPurchasing12.getUserAccountDirectory().createUserAccount("bjO12Purchaser1", "bjO12Purchaser1", bjO12Purchaser1, new PurchasingRole());
//        
//        //Customers
//        Employee skye = bjOrgCustomer11.getEmployeeDirectory().createEmployee("skye");
//        bjOrgCustomer11.getUserAccountDirectory().createUserAccount("skye", "skye", skye, new CustomerRole());
//        
//        Employee xing = bjOrgCustomer11.getEmployeeDirectory().createEmployee("xing");
//        bjOrgCustomer11.getUserAccountDirectory().createUserAccount("xing", "xing", xing, new CustomerRole());
        
        return system;
    }
    
}
