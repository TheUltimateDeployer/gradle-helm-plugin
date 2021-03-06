package org.unbrokendome.gradle.plugins.helm.command

import org.gradle.api.file.Directory
import org.gradle.api.provider.ListProperty
import org.gradle.api.provider.Provider


/**
 * Holds options that apply to all Helm commands.
 */
interface GlobalHelmOptions {

    /**
     * The name or path of the Helm executable. The `PATH` variable is taken into account, so this
     * can just be `"helm"` if the Helm client is installed in a suitable location.
     */
    val executable: Provider<String>

    /**
     * Indicates whether to use the verbose output (`--debug` flag) when invoking commands.
     */
    val debug: Provider<Boolean>

    /**
     * The path of the Helm home directory. If this provider has a value, it will be used to set the
     * `HELM_HOME` environment variable for each Helm invocation.
     */
    val home: Provider<Directory>

    /**
     * Additional command-line arguments to pass to the Helm CLI.
     *
     * This can be used for command-line options that have no counterpart in the plugin.
     */
    val extraArgs: ListProperty<String>
}
