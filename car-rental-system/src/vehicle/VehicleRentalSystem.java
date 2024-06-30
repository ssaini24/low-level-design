package vehicle;

import location.Location;
import store.Store;
import user.User;

import java.util.List;

public class VehicleRentalSystem {

    List<Store> storeList;
    List<User> userList;

    public VehicleRentalSystem(List<Store> storeList, List<User> userList) {
        this.storeList = storeList;
        this.userList = userList;
    }

    public Store locateStore(Location location){
        return storeList.get(0);
    }
}
