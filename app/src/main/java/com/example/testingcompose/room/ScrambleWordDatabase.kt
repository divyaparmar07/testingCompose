package com.example.testingcompose.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.testingcompose.model.ScrambleWord
import kotlinx.coroutines.CoroutineScope

@Database(entities = [ScrambleWord::class], version = 1, exportSchema = false)
abstract class ScrambleWordDatabase : RoomDatabase() {
    abstract fun getDao(): ScrambleWordDAO

    companion object {

        //        @Volatile
        private var INSTANCE: ScrambleWordDatabase? = null

        fun getDatabase(context: Context): ScrambleWordDatabase {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {

                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        ScrambleWordDatabase::class.java, "scrambleword_database"
                    )
                        .fallbackToDestructiveMigration()
                        .allowMainThreadQueries()
                        .build()

                    INSTANCE = instance
                }

                return instance

            }
        }

    }

}