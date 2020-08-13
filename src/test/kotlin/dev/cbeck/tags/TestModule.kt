package dev.cbeck.tags

import com.google.inject.AbstractModule
import com.nhaarman.mockitokotlin2.mock
import dev.cbeck.tags.pgsql.TagDao
import org.junit.Ignore

@Ignore
class TestModule : AbstractModule() {
    override fun configure() {
        bind(TagStorage::class.java).toInstance(mock())
        bind(TagDao::class.java).toInstance(mock())
    }
}