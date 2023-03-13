import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class CustomBaseAdapter extends BaseAdapter {

    Context context;
    String theList[];
    LayoutInflater inflater;
    public CustomBaseAdapter(Context ctx, String[] theList)
    {
        this.context = ctx;
        this.theList = theList;
        inflater = LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return theList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //convertView = inflater.inflate(R.layout.activity_custom_list_view, null);
        //extView txtView
        return null;
    }
}
