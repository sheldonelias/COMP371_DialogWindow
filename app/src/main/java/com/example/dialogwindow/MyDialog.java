package com.example.dialogwindow;
import androidx.fragment.app.DialogFragment;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;

public class MyDialog extends DialogFragment
{

    public Dialog onCreateDialog(Bundle savedInstanceState)
    {
        // Use the Builder class because this dialog
        // has a simple UI
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        // Dialog will have "Make a selection" as the title
        builder.setMessage("Make a selection")

                //Notice we are chaining, ignore the white space. Intentionally
                //missing the semi-colon

                // An OK button that does nothing
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // Nothing happening here
                    }
                })
                ///Notice we are chaining, ignore the white space. Intentionally
                //missing the semi-colon

                // A "Cancel" button that does nothing
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // Nothing happening here either
                    }
                });


        return builder.create();
    }

}
