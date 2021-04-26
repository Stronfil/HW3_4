package gb.cloud.client.factory;

import gb.cloud.client.service.NetworkService;
import gb.cloud.client.service.impl.IONetworkService;

public class Factory {

    public static NetworkService getNetworkService() {
        return IONetworkService.getInstance();
    }

}
