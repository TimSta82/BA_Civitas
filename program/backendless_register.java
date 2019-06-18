BackendlessUser user = new BackendlessUser();
user.setEmail(email);
user.setPassword(password);
// for adding columns to backendless, use setProperty like below
user.setProperty("name", name);

// enable progress indicator 
showProgress(true);
// display progress information
tvLoad.setText(R.string.register_backendless_user);

// registering user to backendless
Backendless.UserService.register(user, new AsyncCallback<BackendlessUser>() {
	@Override
	public void handleResponse(BackendlessUser response) {
		// disable progress indicator
		showProgress(false);
		mainActivity.fragmentSwitch(new LoginFragment(), false, "");
	}
	@Override
	public void handleFault(BackendlessFault fault) {
		Toast.makeText(getContext(), getResources()
					.getText(R.string.toast_backendless_error) + 
					fault.getMessage(), Toast.LENGTH_SHORT).show();
		// disable progress indicator
		showProgress(false);
	}
});