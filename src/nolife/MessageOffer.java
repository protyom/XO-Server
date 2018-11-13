package nolife;

import java.io.Serializable;

public class MessageOffer extends Message implements Serializable {

    private static final long serialVersionUID = 1L;

    public String usrNic;
    public String usrToOffer;

    public MessageOffer( String usrNic, String usrToOffer ) {

        super( Protocol.CMD_OFFER );
        this.usrNic = usrNic;
        this.usrToOffer = usrToOffer;
    }

}