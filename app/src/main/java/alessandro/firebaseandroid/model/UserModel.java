package alessandro.firebaseandroid.model;

import com.google.firebase.database.Exclude;

/**
 * Created by Alessandro Barreto on 22/06/2016.
 */
public class UserModel {

    private String id;
    private String name;
    private String photo_profile;

    public UserModel() {
    }

    public UserModel(String name, String photo_profile, String id) {
        this.name = name;
        this.photo_profile = photo_profile;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto_profile() {
        return photo_profile;
    }

    public void setPhoto_profile(String photo_profile) {
        this.photo_profile = photo_profile;
    }

    @Exclude
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
