Backendless.UserService.restorePassword(email, new AsyncCallback<Void>() {
	@Override
	public void handleResponse(Void response) {
		Toast.makeText(getContext(), 
				getResources().getText(
				R.string.toast_backendless_reset_password_instructions), 
				Toast.LENGTH_SHORT).show();
		showProgress(false);
	}

	@Override
	public void handleFault(BackendlessFault fault) {
		Toast.makeText(getContext(), 
				getResources().getText(R.string.toast_backendless_error)
				+ fault.getMessage(), Toast.LENGTH_SHORT).show();
		showProgress(false);
	}
});