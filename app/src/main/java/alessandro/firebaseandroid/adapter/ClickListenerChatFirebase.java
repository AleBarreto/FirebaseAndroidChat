package alessandro.firebaseandroid.adapter;

import android.view.View;

/**
 * Created by Alessandro Barreto on 27/06/2016.
 */
public interface ClickListenerChatFirebase {

    /**
     * Quando houver click na imagem do chat
     * @param view
     * @param position
     */
    void clickImageChat(View view, int position,String nameUser,String urlPhotoUser,String urlPhotoClick);

    /**
     * Quando houver click na imagem de mapa
     * @param view
     * @param position
     */
    void clickImageMapChat(View view, int position,String latitude,String longitude);

}
