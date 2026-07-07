<?xml version="1.0" encoding="utf-8"?>
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#F5F5F5">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical">

        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Mata Kuliah"
            android:textStyle="bold"
            android:textSize="22sp"
            android:gravity="center"
            android:padding="16dp"/>

        <include layout="@layout/matakuliah"/>

        <include layout="@layout/matakuliah"/>

        <include layout="@layout/matakuliah"/>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:padding="12dp">

            <Button
                android:id="@+id/btnTambah"
                android:layout_width="0dp"
                android:layout_height="50dp"
                android:layout_weight="1"
                android:text="Tambah"/>

            <Button
                android:id="@+id/btnHapus"
                android:layout_width="0dp"
                android:layout_height="50dp"
                android:layout_weight="1"
                android:text="Hapus Semua"/>
        </LinearLayout>

    </LinearLayout>

</ScrollView>
