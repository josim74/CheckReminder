package softtech.smg.com.checkreminder;

/**
 * Created by SMG-ADMIN on 3/27/2018.
 */

public class PayableAndRecievableModel {

    private String personName;
    private String checkDate;
    private String amount;
    private String checkNumber;
    private String bankName;

    public PayableAndRecievableModel(String personName, String checkDate, String amount, String checkNumber, String bankName) {
        this.personName = personName;
        this.checkDate = checkDate;
        this.amount = amount;
        this.checkNumber = checkNumber;
        this.bankName = bankName;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(String checkDate) {
        this.checkDate = checkDate;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
