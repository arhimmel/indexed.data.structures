package com.rsm.io.connector.soup;

import com.rsm.event.Event;

/**
 * Created by rmanaloto on 2/25/14.
 */
public interface SOUPConnector {

    void onMessageSent(Event envent);
}
