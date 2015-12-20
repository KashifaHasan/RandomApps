import CommonApi.Base;

/**
 * Created by mdalam on 12/19/15.
 */
public class UberBase extends Base {


    public void SignUp()throws Exception{


        clickByXpath("html/body/div[2]/section/section[1]/div/div/div[1]/div/div/div[2]/a");
        typeByCss("#email", "mdalam@gmail.com");
        typeByCss("#password", "abcd1234");
        typeByCss("#first_name","Md");
        typeByCss("#last_name","Alam");
        typeByCss("#mobile","123456789");
        typeByCss("#card_number","1234567812345678");
        typeByCss("#card_code","123");
        clickByXpath(".//*[@id='card_expiration_month-month']/option[3]");
        clickByXpath(".//*[@id='card_expiration_year-year']/option[3]");
        typeByCss("#billing_zip", "11435");
        typeByCss("#promotion_code","11223");
        clickByXpath("html/body/section/section/div[1]/section[2]/article/form/div[12]/div[1]/div[1]");



    }
}
