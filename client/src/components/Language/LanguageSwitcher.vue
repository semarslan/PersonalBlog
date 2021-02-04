<template>
  <div>
    <v-btn text
           @click="toggleVisibility"
           @keydown.space.exact.prevent="toggleVisibility"
           @keydown.esc.exact="hideDropdown"
           @keydown.shift.tab="hideDropdown"
           @keydown.up.exact.prevent="startArrowKeys"
           @keydown.down.exact.prevent="startArrowKeys"
    >
      <img :src="`/${$i18n.locale}.png`" alt="flag">
    </v-btn>
    <v-list-item-group v-on-clickaway="hideDropdown" v-if="isVisible" ref="dropdown" class="pr-0 mr-0">
      <v-list-item
          class="pr-0 mr-0"
          @click.prevent="setLocale('en')"
          @keydown.up.exact.prevent=""
          @keydown.tab.exact="focusNext(false)"
          @keydown.down.exact.prevent="focusNext(true)"
          @keydown.esc.exact="hideDropdown"
      >
        <img src="/en.png" alt="english flag"/>
      </v-list-item>
      <v-list-item
          class="pr-0 mr-0"
          @click.prevent="setLocale('tr')"
          @keydown.up.exact.prevent=""
          @keydown.tab.exact="focusNext(false)"
          @keydown.down.exact.prevent="focusNext(true)"
          @keydown.esc.exact="hideDropdown"
      >
        <img src="/tr.png" alt="tr flag"/>
      </v-list-item>
    </v-list-item-group>
  </div>
</template>

<script>
import {mixin as clickaway} from 'vue-clickaway'

export default {
  mixins: [clickaway],
  data() {
    return {
      isVisible: false,
      focusedIndex: 0,
    }
  },
  methods: {
    toggleVisibility() {
      this.isVisible = !this.isVisible
    },
    hideDropdown() {
      this.isVisible = false
      this.focusedIndex = 0
    },
    startArrowKeys() {
      if (this.isVisible) {
        this.$refs.dropdown.children[0].children[0].focus()
      }
    },
    focusNext(isArrowKey) {
      this.focusedIndex = this.focusedIndex + 1
      if (isArrowKey) {
        this.focusItem()
      }
    },
    focusItem() {
      this.$refs.dropdown.children[this.focusedIndex].children[0].focus()
    },
    setLocale(locale) {
      this.$i18n.locale = locale
      this.$router.push({
        params: {lang: locale}
      })
      this.hideDropdown()
    }
  }
}
</script>

<style scoped>

</style>