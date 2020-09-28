package interface_segregation;

/* here we can see there are methods that we dont need to implement
*  so what we can do is create a interface that offers only the methods that we need to implement
* */
public class OnlineClientImpl implements Orders, AcceptedOrder {

    @Override
    public void acceptOnlineOrder() {

    }

    @Override
    public void takePhoneOrder() {

    }

    @Override
    public void acceptedOrder() {
        acceptOnlineOrder();
    }
}
