BackendlessUser user = new BackendlessUser();
user.setEmail(email);
user.setPassword(password);
// for adding columns to backendless, use setProperty like below
user.setProperty("name", name);

Backendless.UserService.register(user, new AsyncCallback<BackendlessUser>() {
	@Override
	public void handleResponse(BackendlessUser response) {

		showProgress(false);
		mainActivity.fragmentSwitch(new LoginFragment(), false, "");

	}

	@Override
	public void handleFault(BackendlessFault fault) {
		Toast.makeText(getContext(), 
				getResources().getText(R.string.toast_backendless_error) 
				+ fault.getMessage(), 
				Toast.LENGTH_SHORT).show();
		showProgress(false);
	}
});