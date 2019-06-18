webView = findViewById(R.id.webview_impressum);
webView.getSettings().setJavaScriptEnabled(true);
webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
webView.getSettings().setSupportMultipleWindows(true);
webView.getSettings().setSupportZoom(true);
webView.getSettings().setBuiltInZoomControls(true);
webView.getSettings().setAllowFileAccess(true);
webView.setWebViewClient(new WebViewClient() {
	@Override
	public void onPageFinished(WebView view, String url) {
		setProgressBarIndeterminateVisibility(false);
		super.onPageFinished(view, url);
	}
});
webView.loadUrl(CIVITAS_URL);
webView.setVisibility(View.VISIBLE);