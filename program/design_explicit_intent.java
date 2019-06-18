Intent intent = new Intent(getActivity(), MapActivity.class);
intent.putExtra(getResources().getString(R.string.origin), TAG);
startActivity(intent);