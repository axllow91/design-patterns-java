package single_responsibility_principle;

import java.util.Date;

public class HRPromotions {
    public boolean isPromotionDueThisYear(Employee employee) {
        return employee.getDate().equals(new Date());
    }
}
