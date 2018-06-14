package world.live;

import java.util.Date;

public interface Growth {

    Date growth();

    Date ageIs(Date birthDate, Date maxAge);

    Date birthDateIs(Date age, Date maxAge);
}