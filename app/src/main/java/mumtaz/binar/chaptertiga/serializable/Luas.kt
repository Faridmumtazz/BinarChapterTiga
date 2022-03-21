package mumtaz.binar.chaptertiga.serializable

import android.os.Parcel
import android.os.Parcelable

data class Luas(val panjang:Int?, val lebar:Int?) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        if (panjang != null) {
            parcel.writeInt(panjang)
        }
        if (lebar != null) {
            parcel.writeInt(lebar)
        }
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Luas> {
        override fun createFromParcel(parcel: Parcel): Luas {
            return Luas(parcel)
        }

        override fun newArray(size: Int): Array<Luas?> {
            return arrayOfNulls(size)
        }
    }
}
