# Get Samsung email password
Want to recover your Samsung email app password ? Here is the solution

You need to recover in your phone two things in the application directory com.samsung.android.email.provider:
- Your encoded password, it is available in the table HostAuth in the database file: databases/EmailProvider.db (use SQLite for instance)
- Your passcode, it is available in plain text in the file: files/tmpSetupData

Change the variables in the code with respectively both you found: password and passcode.
Run the code in Java (I recommend Eclipse as an IDLE)

If you have questions or want to say me thanks create a new Issue in the associated tab (even for thanks message ;)).

Tested with a full up-to-date setup (23/09/2019):
- Samsung: J5
- Android version: 8.1.0
- Samsung Email application version: 6.1.00.13
- Orange email account

Enjoy free/open-source projects !
