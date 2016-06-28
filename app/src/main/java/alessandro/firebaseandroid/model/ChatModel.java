package alessandro.firebaseandroid.model;


/**
 * Created by Alessandro Barreto on 17/06/2016.
 */
public class ChatModel {

    private String id;
    private UserModel userModel;
    private String message;
    private String timeStamp;
    private FileModel file;
    private MapModel mapModel;

    public ChatModel() {
    }

    public ChatModel(UserModel userModel, String message, String timeStamp, FileModel file) {
        this.userModel = userModel;
        this.message = message;
        this.timeStamp = timeStamp;
        this.file = file;
    }

    public ChatModel(UserModel userModel, String timeStamp, MapModel mapModel) {
        this.userModel = userModel;
        this.timeStamp = timeStamp;
        this.mapModel = mapModel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public FileModel getFile() {
        return file;
    }

    public void setFile(FileModel file) {
        this.file = file;
    }

    public MapModel getMapModel() {
        return mapModel;
    }

    public void setMapModel(MapModel mapModel) {
        this.mapModel = mapModel;
    }

    @Override
    public String toString() {
        return "ChatModel{" +
                "mapModel=" + mapModel +
                ", file=" + file +
                ", timeStamp='" + timeStamp + '\'' +
                ", message='" + message + '\'' +
                ", userModel=" + userModel +
                '}';
    }
}
