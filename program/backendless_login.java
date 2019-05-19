Backendless.UserService.login(email, password, new AsyncCallback<BackendlessUser>() {
	@Override
	public void handleResponse(BackendlessUser response) {
		ApplicationClass.user = response;
		Toast.makeText(getContext(), 
				getResources().getText(R.string.toast_login_successful), 
				Toast.LENGTH_SHORT).show();
		// if user is successful logged in
		retrieveArtefactsFromBackendless();
		//navigateToMapActivity();
	}

	@Override
	public void handleFault(BackendlessFault fault) {
		Toast.makeText(getContext(), 
				getResources().getText(R.string.toast_backendless_error) 
				+ fault.getMessage(), 
				Toast.LENGTH_SHORT).show();
		showProgress(false);
	}
}, true);